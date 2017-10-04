package net.vergien.beanautoutils.processor;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Processor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeKind;
import javax.lang.model.util.ElementFilter;
import javax.tools.Diagnostic;
import javax.tools.JavaFileObject;
import com.google.auto.service.AutoService;
import net.vergien.beanautoutils.annotation.Bean;

@SupportedAnnotationTypes({"net.vergien.beanautoutils.annotation.Bean"})
@SupportedSourceVersion(SourceVersion.RELEASE_8)
@AutoService(Processor.class)
public class BeanAutoUtilsProcessor extends AbstractProcessor {

  @Override
  public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
    for (TypeElement annotation : annotations) {
      Set<? extends Element> annotatedElements = roundEnv.getElementsAnnotatedWith(annotation);
      TypeElement typeElement = (TypeElement) annotatedElements.iterator().next();
      if (typeElement.getKind() != ElementKind.CLASS) {
        error("The annotation @" + Bean.class.getSimpleName() + " can only be applied on classes.",
            typeElement);
      }

      List<FieldInfo> fieldInfos = new ArrayList<>();
      for (VariableElement variableElement : ElementFilter
          .fieldsIn(typeElement.getEnclosedElements())) {

        TypeKind kind = variableElement.asType().getKind();

        fieldInfos.add(new FieldInfo(variableElement.getSimpleName().toString(), kind,
            createGetter(variableElement)));
      }
      try {
        writeHelper(typeElement.getQualifiedName().toString(), fieldInfos);
      } catch (IOException e1) {
        e1.printStackTrace();
        error("Failure writing code", typeElement);
      }
    }

    return true;
  }

  private String createGetter(VariableElement variableElement) {
    String prefix;
    if (variableElement.asType().getKind() == TypeKind.BOOLEAN) {
      prefix = "is";
    } else {
      prefix = "get";
    }
    return prefix + StringUtil.firstLetterUpper(variableElement.getSimpleName().toString() + "()");
  }

  private void error(String msg, Element e) {
    processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, msg, e);
  }

  private void writeHelper(String className, List<FieldInfo> fieldInfos) throws IOException {
    BeanUtilClass beanUtilClass = new BeanUtilClass(className, fieldInfos);
    JavaFileObject builderFile =
        processingEnv.getFiler().createSourceFile(beanUtilClass.getBeanUtilClassName());
    try (PrintWriter out = new PrintWriter(builderFile.openWriter())) {
      out.print(beanUtilClass.getCode());
    }
  }

}

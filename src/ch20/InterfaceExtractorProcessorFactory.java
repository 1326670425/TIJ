/**
 * @Title InterfaceExtractorProcessorFactory.java
 * @Package ch20
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * @version 1.0
 */
package ch20;
import com.sun.mirror.apt.*;
import com.sun.mirror.declaration.*;
import java.util.*;
/**
 * @ClassName InterfaceExtractorProcessorFactory
 * @Description TODO
 * @author 吴扬颉
 * @date 2019年4月8日
 * 
 */
public class InterfaceExtractorProcessorFactory implements AnnotationProcessorFactory {
	public AnnotationProcessor getProcessorFor(
	  Set<AnnotationTypeDeclaration> atds,
	  AnnotationProcessorEnvironment env) {
	  return new InterfaceExtractorProcessor(env);
	}
	public Collection<String> supportedAnnotationTypes() {
	  return
	   Collections.singleton("annotations.ExtractInterface");
	}
	public Collection<String> supportedOptions() {
	  return Collections.emptySet();
	}
}
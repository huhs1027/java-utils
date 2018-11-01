package annotation.check;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({FIELD})
@Retention(RUNTIME)
@Documented
public @interface FieldNumberScope {

    String name() default "";

    String message() default "";

    String from() default "";

    String to() default "";
}
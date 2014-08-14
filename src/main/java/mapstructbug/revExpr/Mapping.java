package mapstructbug.revExpr;

import org.mapstruct.Mapper;
import org.mapstruct.Mappings;

@Mapper
public interface Mapping {
    @Mappings({
        @org.mapstruct.Mapping(expression = "java(source.isVal())", target = "val")
    })
    Target map(Source source);
    Source map(Target target);
}

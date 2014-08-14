package mapstructbug.date;

import org.mapstruct.Mapper;

@Mapper
public interface Mapping {
    Target map(Source source);
}

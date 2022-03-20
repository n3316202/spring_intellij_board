package edu.bisang.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestTimeMapper {
    public String getTime();
}

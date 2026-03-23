package com.javaproject.module3.map.map1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SchoolId implements Comparable<SchoolId> {
    public int stdId;

    public int compareTo(SchoolId schoolId){
        return this.getStdId()-schoolId.getStdId();
    }
}

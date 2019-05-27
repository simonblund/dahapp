package com.simonblund.dahapp.data;

import com.simonblund.dahapp.models.DataProcessingRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DataProcessingRecordMapper {

    @Select("select * from data_processing_records")
    List<DataProcessingRecord> getAll();

    @Select("select id,name from data_processing_records")
    List<DataProcessingRecord> getAllOnlyNameId();

    @Select("select * from data_processing_records where id=#{id}")
    List<DataProcessingRecord> getWithId(int id);

    @Insert("insert into data_processing_records(uuid, name, system, reason, data_subject_under_age, especially_confidential_data, time_rule_deletion, time_rule_archivation, legal_justification," +
            " data_gathering, security_precautions, physical_location, virtual_location, comments_internal, safety_information_public, safety_information_internal, created_date, created_user, " +
            "confirmed_date, confirmed_user) " +
            "values(#{uuid}, #{name}, #{system}, #{reason}, #{data_subject_under_age}, #{especially_confidential_data}, #{time_rule_deletion}, #{time_rule_archivation}, #{legal_justification},\" +\n" +
            "            \" #{data_gathering}, #{security_precautions}, #{physical_location}, #{virtual_location}, #{comments_internal}, #{safety_information_public}, #{safety_information_internal}, #{created_date}, #{created_user}, \" +\n" +
            "            \"#{confirmed_date}, #{confirmed_user})")
    void insert(DataProcessingRecord dataProcessingRecord);


}

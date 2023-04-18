package com.choi.bssm.hellospring.repository;

import com.choi.bssm.hellospring.domain.Student;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class MemoryStudentRepository {
    private static Map<Long, Student> store = new HashMap<>();

    public Student save(Student student){
        store.put(student.getId(), student);
        return student;
    }

    public Student findById(Long id){
        return store.get(id);
    }

    public List<Student> findAll(){
        List<Student> list = new ArrayList<>(store.values());
        return  list;
    }
}

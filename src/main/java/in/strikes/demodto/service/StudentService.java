package in.strikes.demodto.service;

import in.strikes.demodto.dto.CreateStudentRequestDto;
import in.strikes.demodto.dto.CreateStudentResponseDto;
import in.strikes.demodto.entity.Student;
import in.strikes.demodto.repository.StudentRepository;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository StudentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.StudentRepository = studentRepository;
    }

    public CreateStudentResponseDto createstudent(@Valid CreateStudentRequestDto requestDto) {
        if (StudentRepository.existsByemail(requestDto.getEmail())) {
            throw new IllegalArgumentException("Student email already exists");
        }
        Student student = new Student();
        student.setName(requestDto.getName());
        student.setAge(requestDto.getAge());
        student.setEmail(requestDto.getEmail());
        student.setRollno(requestDto.getRollNo());
        student.setSubject(requestDto.getSubject());
        student.setDeleted(false);

        Student savedStudent = StudentRepository.save(student);
        CreateStudentResponseDto responseDto = new CreateStudentResponseDto();
        responseDto.setId(savedStudent.getId());
        responseDto.setName(savedStudent.getName());
        responseDto.setAge(savedStudent.getAge());
        responseDto.setEmail(savedStudent.getEmail());
        responseDto.setRollNo(savedStudent.getRollno());
        responseDto.setSubject(savedStudent.getSubject());
        responseDto.setMessage("Student created sucessfully");
        return responseDto;
    }

    public List<Student> getAllStudents() {
        return StudentRepository.findAll();
    }
}

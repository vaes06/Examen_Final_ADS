package infraestructure.hibernate.repository;

import domain.entities.DoctorateStudent;
import domain.entities.MasterStudent;
import domain.entities.contracts.repository.MasterStudentRepository;
import infraestructure.hibernate.HibernateRepository;

public class MasterHibernateRepository extends HibernateRepository <MasterStudent> implements MasterStudentRepository {

}

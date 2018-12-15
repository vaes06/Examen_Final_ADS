package domain.entities.contracts.repository;

public interface StudentRepository<T> {
	public T persist(T entity);
	public T save(T entity);
	public T update(T entity);
	public T merge(T entity);
	public T saveOrUpdate(T entity);
	
}


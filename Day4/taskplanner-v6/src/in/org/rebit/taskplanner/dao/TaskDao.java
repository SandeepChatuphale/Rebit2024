package in.org.rebit.taskplanner.dao;

import in.org.rebit.taskplanner.entity.Task;
import in.org.rebit.taskplanner.exception.dao.NoRecordFoundException;

public interface TaskDao {

	public Task save(Task taskTobeCreated);
	public Task findById(int id) throws NoRecordFoundException ;
	public Task update(Task taskToBeUpdated);
	public boolean deleteById(int id);
}

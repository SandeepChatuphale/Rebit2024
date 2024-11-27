package in.org.rebit.taskplanner.dao;

import in.org.rebit.taskplanner.entity.Task;

public interface TaskDao {

	public Task save(Task taskTobeCreated);
	public Task findById(int id);
	public Task update(Task taskToBeUpdated);
	public boolean deleteById(int id);
}

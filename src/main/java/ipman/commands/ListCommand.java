package ipman.commands;

import ipman.models.Task;
import ipman.models.TaskList;

/**
 * Displays all the <code>Task</code>s from the <code>Context</code>'s
 * <code>TaskList</code>.
 * @see Task
 * @see Context
 * @see TaskList
 */
public class ListCommand implements Command {
    @Override
    public void execute(Context context) {
        TaskList tasks = context.tasks();
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            context.ui().showMessageF("%d. %s", i + 1, task);
        }
    }
}

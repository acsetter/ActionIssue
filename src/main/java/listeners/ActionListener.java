package listeners;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.DataContext;
import com.intellij.openapi.actionSystem.ex.AnActionListener;
import org.jetbrains.annotations.NotNull;

public class ActionListener implements AnActionListener {
    @Override
    public void beforeActionPerformed(@NotNull AnAction action, @NotNull DataContext dataContext, @NotNull AnActionEvent event) {
        // Should print twice on action events that occur from NavBarToolbar, ToolbarDecorator, and possibly other places.
        System.out.println("Before Action: " + event.getPresentation().getText() + " from " + event.getPlace());
    }

    @Override
    public void afterActionPerformed(@NotNull AnAction action, @NotNull DataContext dataContext, @NotNull AnActionEvent event) {
        // Should also print twice on action events that occur from NavBarToolbar, ToolbarDecorator, and possibly other places.
        System.out.println("After Action: " + event.getPresentation().getText() + " from " + event.getPlace());
    }
}

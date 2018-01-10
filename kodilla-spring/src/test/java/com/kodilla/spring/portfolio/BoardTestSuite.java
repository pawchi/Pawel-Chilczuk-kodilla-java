package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDo = "element ToDoList";
        String inProgress = "element InProgressList";
        String done = "element Done";
        board.toDoList.tasks.add(toDo);
        board.inProgressList.tasks.add(inProgress);
        board.doneList.tasks.add(done);

        //Then
        String resultToDo = board.toDoList.tasks.get(0);
        Assert.assertEquals(resultToDo, "element ToDoList");

        String resultInProgress = board.inProgressList.tasks.get(0);
        Assert.assertEquals(resultInProgress, "element InProgressList");

        String resultDone = board.doneList.tasks.get(0);
        Assert.assertEquals(resultDone, "element Done");
    }
}

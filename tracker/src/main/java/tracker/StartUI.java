package tracker;

import tracker.actions.*;

/**
 * Класс интерфейса программы
 * tracker
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public class StartUI {
    /**
     * Осуществляет связь между элементами меню и логикой приложения
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.length);
            UserAction action = actions[select];
            run = action.execute(input, tracker);
        }
    }

    /**
     * Выводит в консоль меню приложения
     */
    private void showMenu(UserAction[] actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.length; index++) {
            System.out.println(index + ". " + actions[index].name());
        }
    }


    public static void main(String[] args) {
        Input validate = new ValidateInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new QuitAction()
        };
        new StartUI().init(validate, tracker, actions);
    }
}

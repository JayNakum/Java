package jay.nakum.memento;

public class Main {
    public static void main(String[] args) throws Exception {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState(AppState.New);
        System.out.println("Process State: " + originator.getState());

        originator.setState(AppState.Ready);
        careTaker.add(originator.saveStateToMemento());
        System.out.println("Process State: " + originator.getState());

        originator.setState(AppState.Running);
        careTaker.add(originator.saveStateToMemento());
        System.out.println("Process State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(AppState.Ready));
        System.out.println("Process State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(AppState.Running));
        System.out.println("Process State: " + originator.getState());

        originator.setState(AppState.Waiting);
        System.out.println("Process State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(AppState.Ready));
        System.out.println("Process State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(AppState.Running));
        System.out.println("Process State: " + originator.getState());

        originator.setState(AppState.Terminated);
        System.out.println("Process State: " + originator.getState());
    }
}

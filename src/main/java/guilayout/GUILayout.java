package guilayout;

public class GUILayout {

    public void go() {
        new BorderEx().show();
        new GridEx().show();
        new FlowEx().show();
    }

    public static void main(String[] args) {
        new GUILayout().go();
    }
}

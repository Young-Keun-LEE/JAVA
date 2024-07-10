package Lambda.LambdaExample3;

public class Button {
    @FunctionalInterface
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        if(clickListener != null){
            clickListener.onClick();
        }
    }
}

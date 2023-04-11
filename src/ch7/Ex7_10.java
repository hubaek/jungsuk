package ch7;

class MyTv2{
    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevchannel;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) return;
        this.volume=volume;
    }
    public int getChannel(){
        return this.channel;
    }
    public void setChannel(int channel){
        if (channel < MIN_CHANNEL || channel > MAX_CHANNEL) return;
        prevchannel = this.channel;     // 어떤 순서로 동작하는지 모르겠음.
        this.channel = channel;

    }
    public void gotoPrevChannel(){
        setChannel(prevchannel);
    }
//    public int getVolume(){
//        return this.volume;
//    }
//    public int getChannel(){
//        return this.channel;
//    }
}
public class Ex7_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH : "+t.getChannel());
        t.setChannel(20);
        System.out.println("CH : "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH : "+t.getChannel());
    }
}

public class AppleFactory implements MobileFactory{
    @Override
    public Mobile createMobile(){
        return new AppleMobile();
    }
    @Override
    public OS createOS(){
        return new iOS();
    }
}

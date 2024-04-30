public class NokiaFactory implements MobileFactory {
    @Override
    public Mobile createMobile() {
        return new NokiaMobile();
    }

    @Override
    public OS createOS() {
        return new WindowsOS();
    }
}

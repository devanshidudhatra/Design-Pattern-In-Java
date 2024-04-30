public class Shopkeeper {
    // facade which hides the implementation
    public static String deliverPhone(PhoneType phoneType){
        Components comp = new Components();
        switch(phoneType){
            case iPhone:
                Phone IPh=new IPhone();
                String phComp=comp.getiPhoneComponents();
                IPh.builtPhone(phComp);
                return IPh.deliverPhone();

            case Android:
                Phone Android=new AndroidPhone();
                String PhComp=comp.getAndroidComponents();
                Android.builtPhone(PhComp);
                return Android.deliverPhone();
        }
        return null;
    }
}

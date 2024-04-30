import java.util.*;

interface Subject{
    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscriber(String news);
    public void uploadNewsletter(String news);
}

interface Subscriber{
    public void update(String news);
}

class Newsletter implements Subject{
    private List<Subscriber>subscribers;

    //Constructor
    public Newsletter(){
        subscribers = new ArrayList<>();
    }

    @Override
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }
    public void notifySubscriber(String news){
        for(Subscriber subscriber : subscribers){
            subscriber.update(news);
        }
    }
    public void uploadNewsletter(String news){
        System.out.println("Upload: " + news);
        notifySubscriber(news);
    }
}

class NewsletterSubscriber implements Subscriber{
    private String subscriberName;

    // Constructor
    public NewsletterSubscriber(String subscriberName){
        this.subscriberName = subscriberName;
    }

    @Override
    public void update(String news){
        System.out.println(subscriberName + " recieved message : " + news);
    }
}

class NewsletterDemo{
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Subscriber s1 = new NewsletterSubscriber("John");
        Subscriber s2 = new NewsletterSubscriber("Sam");
        Subscriber s3 = new NewsletterSubscriber("Ron");

        newsletter.addSubscriber(s1);
        newsletter.addSubscriber(s2);
        newsletter.addSubscriber(s3);

        newsletter.uploadNewsletter("Techfest is coming soon !!!");

        newsletter.removeSubscriber(s3);

        newsletter.uploadNewsletter("Cultural Fest is on the way !!!");
    }
}
// import java.util.ArrayList;
// import java.util.List;

// class Composite implements Component {
//     private String name;
//     private List<Component> components = new ArrayList<>();

//     public Composite(String name) {
//         this.name = name;
//     }

//     public void addComponent(Component component) {
//         components.add(component);
//     }

//     @Override
//     public void showName() {
//         System.out.println("Composite: " + getName());
//         for (Component component : components) {
//             component.showName();
//         }
//     }

//     @Override
//     public String getName() {
//         return name;
//     }
// }

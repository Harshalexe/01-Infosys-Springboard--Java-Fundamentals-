public class Tester {
    public static void main(String[] args) {
        // Create an object of class InfyTV
        InfyTV infyTV = new InfyTV();

        // Try to access private members directly (This will result in a compilation error)
        // infyTV.correspondent = "Kimberely";  // Error: correspondent has private access
        // infyTV.newsReporter = "Hudson";      // Error: newsReporter has private access
        // infyTV.photographer = "Joshua";      // Error: photographer has private access

        // Access private members using setters
        infyTV.setCorrespondent("Kimberely");
        infyTV.setNewsReporter("Hudson");
        infyTV.setPhotographer("Joshua");

        // Show the documentary to the public
        infyTV.documentaryFilm();
    }
}
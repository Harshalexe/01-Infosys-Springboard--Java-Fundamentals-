class InfyTV {
    private String correspondent;
    private String newsReporter;
    private String photographer;

    // Setter methods to access private members
    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public void setNewsReporter(String newsReporter) {
        this.newsReporter = newsReporter;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    // Public method to display documentary information
    public void documentaryFilm() {
        System.out.println("A hundred years ago there were 100,000 tigers in the world. Today there are as few as 3,200. Why are tigers disappearing?......");
        System.out.println("by Correspondent: " + correspondent);
        System.out.println("Photographer: " + photographer);
        System.out.println("newsReporter: " + newsReporter);
    }
}

package com.wiley.realworldjava.gitplay;

public class GitDemo {
    private String description;

   public GitDemo(String description) {
      this.description = description;
   }

   public void displayDescription() {
        System.out.println("Description: " + description);
    }

    public static void main(String[] args) {
       GitDemo demo = new GitDemo("Hello, Git!");

        // Display the initial description
        demo.displayDescription();      // Make some change and commit

        // Make more change and commit
        demo.description = "Version control with Git is fun and easy.";
        demo.displayDescription();

        // Make more changes and commit
        demo.description = "Git is powerful.";
        demo.displayDescription();
    }
}

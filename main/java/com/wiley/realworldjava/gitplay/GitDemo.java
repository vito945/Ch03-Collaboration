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
        demo.description = "Git is fun and easy, and very powerful.";
        demo.displayDescription();

        // Make another change
        demo.description = "Changes for rebase";
        demo.displayDescription();

        // And yet another change
        demo.description = "Change2 for rebase";
        demo.displayDescription();
    }
}

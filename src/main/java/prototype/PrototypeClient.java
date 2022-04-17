package prototype;

public class PrototypeClient {

    public static void main(String[] args) {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser("user");
        repository.setName("name");

        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(1);
        gitHubIssue.setTitle("title");

        String url = gitHubIssue.getUrl();
        System.out.println(url);

        GitHubIssue clone = (GitHubIssue) gitHubIssue.clone();

        System.out.println(clone != gitHubIssue);
        System.out.println(!clone.equals(gitHubIssue));
        System.out.println(clone.getClass() == gitHubIssue.getClass());
        System.out.println(clone.getRepository() != gitHubIssue.getRepository());
    }

}

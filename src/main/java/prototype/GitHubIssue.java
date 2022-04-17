package prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class GitHubIssue implements Cloneable {

    private int id;

    private String title;

    private GitHubRepository repository;

    public GitHubIssue(GitHubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        return String.format("https://github.com/%s/%s/issues/%d",
                repository.getUser(),
                repository.getName(),
                this.getId());
    }

    @Override
    protected Object clone() {
        GitHubRepository repository = new GitHubRepository();
        repository.setUser(this.repository.getUser());
        repository.setName(this.repository.getName());

        GitHubIssue gitHubIssue = new GitHubIssue(repository);
        gitHubIssue.setId(this.id);
        gitHubIssue.setTitle(this.title);

        return gitHubIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GitHubIssue that = (GitHubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}

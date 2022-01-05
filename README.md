# Sprint 1

## References
[Think-Like-A-Git](http://think-like-a-git.net/)

[Git Visual Guide](https://rogerdudler.github.io/git-guide/)

[Git community book](http://book.git-scm.com/)


## Git Study

git != Github e Gitlab

### Already Knew

`git init`

`git clone username@host:/path/to/repository`

`git add <filename>`

`git add *`

`git commit -m "Commit message"`

`git remote add origin <server>`

`git checkout -b feature_x`

`git branch -d feature_x`

`git push origin <branch>`

`git push origin <branch>`

`git merge <branch>`

`git merge <branch>`

### New Content

`git diff <source_branch> <target_branch>`
* difference between branches

`git tag 1.0.0 1b2e1d63ff`
* It is used to give a tag to a specific commit

*working dir -> index -> HEAD*

There are three main sections of git.
The first one is where the actual files are.
The second one is the index that is used as a stage.
The third one is the HEAD, which points to a commit.

`git fetch origin`
* Fetch the remote information from origin

`git reset --hard origin/master (HEAD)`
* remove all the changes from index and working directory, go back to last commit

`git pull`
* combines `fetch` and `merge (or rebase)`

`git commit --amend`
* it is used to change the last commit with changes as well as the name

`git rebase <base>`
* get all the commits(changes) on actual branch and insert them as last in base branch


`git cherry-pick <commit>`
* get the commit change and add to the branch
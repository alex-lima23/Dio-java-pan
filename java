$ git init
Initialized empty Git repository in c:/Users/alex/Posts/.git/
git remote add origin git@github.com:alexlima/postsdoblog.git 
[remote "origin"]
    url = git@github.com:alexlima/postsdoblog.git
    fetch = +refs/heads/*:refs/remotes/origin/*
git status  
On branch master

Initial commit

Untracked files:  
  (use "git add <file>..." to include in what will be committed)

        Post.txt

nothing added to commit but untracked files present (use "git add" to track)  
git add Post.txt  

$ git status
On branch master

Initial commit

Changes to be committed:  
  (use "git rm --cached <file>..." to unstage)

        new file:   Post.txt
git commit -m "aqui coloco uma mensagem, tipo: comitando primeiro post"  
git push -u origin master  

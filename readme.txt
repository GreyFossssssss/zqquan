记录一些自己的学习记录
1.git config --global user.name zqqquan
2.git config --global user.email 1848337787@qq.com
1. pwd  //查看当前目录
2.git init
3.git add readme.txt//把文件添加到仓库 git 必须放在git仓库所在的文件夹的子文件夹里
4.ls -ah//显示隐藏文件夹
5.git status //查看仓库当前的状态
6.git diff 文件名//查看文件怎么被修改
7.git log查看文件被修改的日志
8.git reset//回到上一个修改之前的版本
9.git rm readme.txt+ git commit -m "remove readme.txt"// 删除版本库中的文件
10.git checkout --test.txt
11.git checkout -b dev ==git branch dev+git checkout dev//创建分支并切换
12.git branch// 查看当前分支
13.git merge dev把分支的成果合并到master分支上
14.git commit -m "备注内容" 把文件提交到仓库
15.$ ssh-keygen -t rsa -C "1848337787@qq.com"
16.$ git remote add origin git@git.oschina.net:appbashi/aaa-wechat.git// 连接远程库
17.$ git pull origin	//复制当前分支的代码到本地
18.$ git checkout zqquan//切换分支
19.$ git status//查看当前状态
20.$ git add Template/dietDetail.html//
21.$ git commit -m "change two files"//
22.$ git push origin zqquan//把修改的文件加入到zqquan分支
23.$ git merge master //把master的代码覆盖到zqquan分支
24. git checkout test  git merge 你的分支  --squash   --squash的作用就是把本分支的多次提交合并成一次提交
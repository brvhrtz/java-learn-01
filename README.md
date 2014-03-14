To make github work on windows
1. download and run github's win desktop app
2. in the app, setup running console as Github bash
3. Do the following as in linux. It will take care the conversion for you 
touch README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/fj49ers/java-learn-01.git
git push -u origin master
4. Refresh you repository and it should have the web interface to add files now. 

This repositary is following the tutorial here
http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/

# code-store

This is my first code change. 

How to add got repo into eclipse :
-> First you need to clone the (git) repository in Eclipse.

Steps to clone git repo in Eclipse
1) Go to GitHub, or BitBucket, and copy the URL of the repo to clone
2) In Eclipse, Open the perspective Git
3) Use the shortcut icon Clone a Git Repository ... (the icons are shown on the view Git Repositories)
4) The dialog Clone Git Repository opens, with the page Source Git Repository
5) (The url of the git repo, should already be filled in, at the field uri)
TIP: The field uri can not be edited. Use the other field, like Host, repository Path, etc to correct the url if required.
6) Press the button Next
7) The page Branch Selection opens
8) All branches from the remote git repository are now shown
9) (Mark the branches you like to clone, by default all branches are checked for cloning)
10) Press the button Next
11) The page Local Destination opens
12) Make sure you select the correct location, where the local clone of the repository should go (something like /home/<user>/git)
TIP: Make sure that you do NOT clone the git repository inside the Eclipse workspace directory!
13) Select from the drop-down Initial branch the branch you like to start working on. (Default is the master branch. Can also easily be changed later.)
14) Press the button Finish, to start the cloning job.

After successful cloning of the git repository, the project(s) in the git repository can be imported into Eclipse as (Eclipse) projects.

Import project in Eclipse

1) From the view Package Explorer select right mouse button menu: Import... or use the Eclipse menu: File -> Import..
2) Select GIT, projects from git
3) select - Existing local repository and click on next
4) select the repository in git - code-store amd click on next
5) if you want to create java project out of the repository then select "Import using the New Project wizard " Then select the new project as java
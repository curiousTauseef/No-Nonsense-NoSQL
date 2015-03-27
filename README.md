No-NonSense NoSQL talk for 2015 Conference Season
===============

Viewable at: http://jlstrater.github.io/No-Nonsense-NoSQL

Based on the OPI Reveal template

## Dependencies
* Node
* Bower
* grunt-cli

##Getting Started
* Run `npm install` to install node dependencies
* Run `bower install` to install client-side dependencies

##Grunt Commands
* `grunt assemble`
  * Minify/uglify the javascript source and css
  * Compiles jade
  * Stages everything in the dist folder
* `grunt run`
  * Starts a server running on port 8000
  * watches for changes on project files
  * When files change, the assemble task is re-run and
  * Livereload triggers browser update on assemble task completion
* `grunt publish`
  * Publishes slides to GitHub pages
  * Uses git subtree merge to merge the contents of dist into the gh-pages branch
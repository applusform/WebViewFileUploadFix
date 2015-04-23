# WebViewFileUploadFix
Android WebView File Upload Fix (Agate Java Script Plugin)

Screen shot :
![Screen shot](https://applusform.github.io/WebViewFileUploadFix/screenshot1.png)

### What it does ?
Fixes the issue that <input type="file"> does not work on Android 4.4.2 by using Agate Java Script Plugin.

### Notice
- This is a sample plugin for very simple cases. It does not cover every case.
- Maybe some modifications will be needed to use this plugin to your site.

### How it does ?
1. First it checks Android OS version. It works for only 4.4, 4.4.1, 4.4.2. The others does not need this plugin.
2. It hides every <input type="file"> tag and insert custom button.
3. It hooks HTML "FORM.submit()" function and uses native post method of MOML http object.

See [assets/moml/ui/androidFileUploadFix-1.1.0.js](https://github.com/applusform/WebViewFileUploadFix/blob/gh-pages/assets/moml/ui/androidFileUploadFix-1.1.0.js) for detail.

### How can I test my URL ?
1. Open "assets/moml/ui/webView.xml" file.
2. Find AGATEWEBVIEW.src attribute and replace "index.htm" value to your URL.

### Can I use this plugin to android.webkit.WebView ?
Yes, but additional works are required.

1. Implement basic file upload feature. (http://stackoverflow.com/a/24280517/3082485)
2. Add bridged Java Script Object functions for replacing agate.appLauncher to accept file from user.
3. Add bridged Java Script Object functions for replacing agate.http.post.

### ETC
1. Latest version of Agate Library : [http://applusform.com](http://applusform.com/en/get-agate)

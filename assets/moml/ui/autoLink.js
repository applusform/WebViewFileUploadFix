function autoLink() {
    try {
        if (document.body != null) {
            var urlPattern = /((http|ftp|https):\/\/[\w-]+(\.[\w-]*)+([\w.,@?^=%&amp;:\/~+#-]*[\w@?^=%&amp;\/~+#-])?)/g
            document.body.innerHTML = document.body.innerHTML.replace(urlPattern, "<a href=\"$1\">$1</a>");
        }
    } catch (e) {
        alert(e);
    }
}
window.setTimeout("autoLink()", 100);

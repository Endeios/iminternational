# iminternational
An idea about internationalizing front end templates

## summary
When one has to internationalize an MVVM application, has also to confront with the internatioanlization problem. I have my strong opinion about the matter, i think that internationalization is too heavy to have it doen on the client side, especially for large applications. Let's do that on client side!

### The root of the problem

Javascript is the language of the web, we have alredy sid that [link], but it has poor support for internationalization. And i do not mean the well known problem [https://developer.mozilla.org/it/docs/Web/JavaScript/Reference/Global_Objects/Intl] of managing time and strings in a proper way in a language. I mean the actual internationalization of an application in javascript, wich means at least transalating the strings in use. There are actually some nice internationalization frameworks for javascript like [http://i18next.com/] or [https://github.com/eligrey/l10n.js/#readme] , but they share the same problem for me: they internationalize the whole application on another "static" resource, wich is usually different from the resource you use to internationalize the server side part of your application. Of course such approach works well if you have a full javascript application, but becomes a bit short whenever you have your javascript application live inside a bigger server side application: I focus on this use case, and I will present you how I would internationalize the such an application, and i will extensivly write about the benefits of such approach

1. Server side eats less memory on your mobile device
2. Server Side is usually faster than your average loading times (it does not make sense to serve resources on wich you need to serve another resource for internationalization)

The cons are the following
1. client side unloads the server from actually internationalizing
2. client side can cache resources and the transfer to application can be minimized (or not).



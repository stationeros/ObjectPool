This is a generic implementation of Object Pool. This should be used when objects are slow/expensive to create and/or are needed for some rather short amount of time. This basically implements a cache of used and active objects. This solution also helps from memory fragmentation issues as we are allocating a big chunk of memory up front and not relenquishing it for the lifetime of our application.

Reference(s)
https://msdn.microsoft.com/en-us/library/ms682822.aspx  
http://www.oodesign.com/object-pool-pattern.html  
http://gameprogrammingpatterns.com/object-pool.html  

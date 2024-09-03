# Java Concepts

### 1. Immutable classes in java
    We need to make the class and the fields final also make field private and set those 
    while creating object.
    Also the fields which are not itself immutable for those use deep cloning
    Uses cases: DTO, Keys for hash map and set.
    By deafault all primitive and primitive wrapper class objects are immutable.
    Also Enums and LocalTime, UUID are immutable.

### 2. How does JVM gets to know the memory location of Hashmap internally
    Internally HashMap uses a hashCode of the key Object and this 
    hashCode is further used by the hash function to find the index of 
    the bucket where the new entry can be added.

### 3. How does JVM stores Cache
    The JVM itself doesn't have a single, unified "cache" system but rather supports
    various caching mechanisms at different levels, from application-level in-memory 
    caches to JIT-compiled code caches and class metadata storage. Developers often use in-memory structures like 
    HashMap or external caching libraries for application-specific caching needs. The JVM manages other types of caches 
    internally to optimize execution, memory management, and interaction with native code

### 4.Singleton Design pattern, Examples in Java class library
    Logger, Runtime

    
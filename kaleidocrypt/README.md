
# Kaleidocrypt

Kaleidocrypt is a framework used to synchronize a configuration model for cryptographic API with Java source code. 
A change on the model needs to be propagated on the Java source code and vice versa.
The configuration model consists of a task as a root element which includes one or multiple algorithms. 
Each algorithm is cryptographic related and has certain properties. 
Source code is Java implementation of the algorithm.

In order to perform the synchronization a user needs to first create a specialized Eclipse project, ```CryptoAPI```, which uses a custom builder ```CryptoAPIProjectBuilder```. 
A cryptographic configuration model can be added to the project using different Eclipse wizards which adds an EMF model serialized as XMI file. 
After performing changes on the model or corresponding Java file a user needs to save the file which activates the builder that recognizes which file was changed and calls a bx tool to do the synchronization.

## Symmetric Encryption Example

Symmetric encryption model is be added by using ```SymmetricEncryption``` wizard. 
It includes a single symmetric block cipher task consisting of one algorithm given in the form of configuration model which is required to be synchronised with the Java source code which includes methods that perform the encryption. 
A user is free to manipulate with the model attributes and elements which is then synchronised with the code. 
Another option is to change the code which causes the model update. 

The symmetric block cipher algorithm has three properties: name, mode and padding. Any change of these properties causes the corresponding changes
in the code. The task also includes required imports which bijectively correspond to Java imports. Since the code is much more expressive than the model not all the changes can be supported. On the model side imports can be added, removed and editied, the algorithm  properties are also editable. Any other changes lead to inconsistent stat.

The Java side is much more restrictive. A user is allowed to freely manipulate with the imports, add new methods, change content of the ```performEncryption``` method and the throwable exceptions of ```encryption``` and ```performEncryption``` methods.

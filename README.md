# cli-rsa-encryption
Cli-RSA is a simple implementation of the RSA encryption algorithm using Java.

The program allows users to generate public and private keys, encrypt and decrypt messages using the keys.

## How to run
Once you have Java installed, you can run the Cli-RSA tool by navigating to the directory where the `RSA.java` file is located and running the following command:

```bash
javac RSA.java
java RSA
```
This will start the Cli-RSA tool, and you will be prompted to select an option.

## Generating Keys
The first option allows you to generate a new set of public and private keys. These keys are used for encrypting and decrypting messages.

## Encrypting and Decrypting Messages
The second option allows you to encrypt a message using a public key. The encrypted message can only be decrypted using the corresponding private key.

The third option allows you to decrypt a message using a private key.

## Concepts
- Public Key: A public key is a key that can be shared with anyone and used for encrypting messages.
- Private Key: A private key is a key that should be kept secret and used for decrypting messages.
- Encryption: Encryption is the process of converting a plaintext message into an unreadable ciphertext.
- Decryption: Decryption is the process of converting a ciphertext back into its original plaintext message.
- RSA Algorithm: RSA is a widely-used encryption algorithm that is based on the mathematical properties of large prime numbers.
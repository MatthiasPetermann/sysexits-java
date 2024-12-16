# sysexits-java

A Java library that provides standardized exit status codes similar to FreeBSD's
sysexits.h. 

## Why Use Standardized Exit Codes?

When writing command-line applications, it's important to indicate not just
whether your program succeeded or failed, but also why it failed. Rather than
simply using generic exit codes like 0 for success and 1 for failure,
standardized exit codes can provide more meaningful feedback to users and
automated systems.

FreeBSD's sysexits.h is an excellent example of a system that has solved this
problem by defining clear and consistent exit codes for different failure
scenarios, such as command-line usage errors, missing input files, and
permission issues.

Inspired by this approach, the sysexits package brings these standardized exit
codes to Java, allowing Java developers to write more informative and maintainable
command-line tools. 

## Usage Example

Here's how you can use the sysexits package in your Java application:

```
import java.io.File;
import net.d2ux.sysexits.SysExits;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.printf("Usage: java %s <filename>%n", Main.class.getSimpleName());
            System.exit(SysExits.EX_USAGE);
        }

        String filename = args[0];
        File file = new File(filename);

        if (!file.exists() || !file.isFile()) {
            System.err.printf("Error opening file: File '%s' does not exist or is not a regular file.%n", filename);
            System.exit(SysExits.EX_NOINPUT);
        }

        System.out.println("File opened successfully");
        System.exit(SysExits.EX_OK);
    }
}
```


## Exit Codes Provided

This package defines the following exit codes:

- EX_OK (0): Successful termination
- EX_USAGE (64): Command-line usage error
- EX_DATAERR (65): Data format error
- EX_NOINPUT (66): Cannot open input
- EX_NOUSER (67): Addressee unknown
- EX_NOHOST (68): Host name unknown
- EX_UNAVAILABLE (69): Service unavailable
- EX_SOFTWARE (70): Internal software error
- EX_OSERR (71): System error (e.g., can't fork)
- EX_OSFILE (72): Critical OS file missing
- EX_CANTCREAT (73): Can't create (user) output file
- EX_IOERR (74): Input/output error
- EX_TEMPFAIL (75): Temporary failure; user is invited to retry
- EX_PROTOCOL (76): Remote error in protocol
- EX_NOPERM (77): Permission denied
- EX_CONFIG (78): Configuration error

## License

This project is licensed under the MIT License.
package net.d2ux.sysexits;

/**
 *
 * @author mpeterma
 */
public class SysExits {

    public static final int EX_OK = 0;         // Successful termination
    public static final int EX_USAGE = 64;     // Command line usage error
    public static final int EX_DATAERR = 65;   // Data format error
    public static final int EX_NOINPUT = 66;   // Cannot open input
    public static final int EX_NOUSER = 67;    // Addressee unknown
    public static final int EX_NOHOST = 68;    // Host name unknown
    public static final int EX_UNAVAILABLE = 69; // Service unavailable
    public static final int EX_SOFTWARE = 70;  // Internal software error
    public static final int EX_OSERR = 71;     // System error (e.g., can't fork)
    public static final int EX_OSFILE = 72;    // Critical OS file missing
    public static final int EX_CANTCREAT = 73; // Can't create (user) output file
    public static final int EX_IOERR = 74;     // Input/output error
    public static final int EX_TEMPFAIL = 75;  // Temporary failure; user is invited to retry
    public static final int EX_PROTOCOL = 76;  // Remote error in protocol
    public static final int EX_NOPERM = 77;    // Permission denied
    public static final int EX_CONFIG = 78;    // Configuration error
}

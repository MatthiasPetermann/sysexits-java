package net.d2ux.sysexits;

/**
 * The {@code SysExits} class provides a collection of constants representing 
 * standardized exit codes used to indicate the status of program termination.
 * These codes are derived from the "sysexits.h" header file found in BSD systems.
 * <p>
 * The purpose of these exit codes is to provide a uniform way for programs
 * to communicate the nature of errors or successes to the operating system
 * or calling processes.
 * </p>
 *
 * <p>Exit codes:</p>
 * <ul>
 *     <li>{@link #EX_OK} - Successful termination</li>
 *     <li>{@link #EX_USAGE} - Command line usage error</li>
 *     <li>{@link #EX_DATAERR} - Data format error</li>
 *     <li>{@link #EX_NOINPUT} - Cannot open input</li>
 *     <li>{@link #EX_NOUSER} - Addressee unknown</li>
 *     <li>{@link #EX_NOHOST} - Host name unknown</li>
 *     <li>{@link #EX_UNAVAILABLE} - Service unavailable</li>
 *     <li>{@link #EX_SOFTWARE} - Internal software error</li>
 *     <li>{@link #EX_OSERR} - System error (e.g., can't fork)</li>
 *     <li>{@link #EX_OSFILE} - Critical OS file missing</li>
 *     <li>{@link #EX_CANTCREAT} - Can't create (user) output file</li>
 *     <li>{@link #EX_IOERR} - Input/output error</li>
 *     <li>{@link #EX_TEMPFAIL} - Temporary failure; user is invited to retry</li>
 *     <li>{@link #EX_PROTOCOL} - Remote error in protocol</li>
 *     <li>{@link #EX_NOPERM} - Permission denied</li>
 *     <li>{@link #EX_CONFIG} - Configuration error</li>
 * </ul>
 *
 * @author mpeterma
 * @version 1.0
 */
public class SysExits {

    /**
     * Successful termination.
     */
    public static final int EX_OK = 0;

    /**
     * Command line usage error.
     */
    public static final int EX_USAGE = 64;

    /**
     * Data format error.
     */
    public static final int EX_DATAERR = 65;

    /**
     * Cannot open input.
     */
    public static final int EX_NOINPUT = 66;

    /**
     * Addressee unknown.
     */
    public static final int EX_NOUSER = 67;

    /**
     * Host name unknown.
     */
    public static final int EX_NOHOST = 68;

    /**
     * Service unavailable.
     */
    public static final int EX_UNAVAILABLE = 69;

    /**
     * Internal software error.
     */
    public static final int EX_SOFTWARE = 70;

    /**
     * System error (e.g., can't fork).
     */
    public static final int EX_OSERR = 71;

    /**
     * Critical OS file missing.
     */
    public static final int EX_OSFILE = 72;

    /**
     * Can't create (user) output file.
     */
    public static final int EX_CANTCREAT = 73;

    /**
     * Input/output error.
     */
    public static final int EX_IOERR = 74;

    /**
     * Temporary failure; user is invited to retry.
     */
    public static final int EX_TEMPFAIL = 75;

    /**
     * Remote error in protocol.
     */
    public static final int EX_PROTOCOL = 76;

    /**
     * Permission denied.
     */
    public static final int EX_NOPERM = 77;

    /**
     * Configuration error.
     */
    public static final int EX_CONFIG = 78;
}

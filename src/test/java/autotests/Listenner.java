package autotests;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Listenner implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
    }
}

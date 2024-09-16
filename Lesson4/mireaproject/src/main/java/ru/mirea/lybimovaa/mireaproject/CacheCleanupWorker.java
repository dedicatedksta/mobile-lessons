package ru.mirea.lybimovaa.mireaproject;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import java.io.File;

public class CacheCleanupWorker extends Worker {

    public CacheCleanupWorker(
            @NonNull Context context,
            @NonNull WorkerParameters params) {
        super(context, params);
    }

    @NonNull
    @Override
    public Result doWork() {
        clearCache();

        return Result.success();
    }

    private void clearCache() {
        File cacheDir = getApplicationContext().getCacheDir();

        if (cacheDir != null && cacheDir.isDirectory()) {
            deleteRecursive(cacheDir);
        }
    }

    private void deleteRecursive(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            for (File child : fileOrDirectory.listFiles()) {
                deleteRecursive(child);
            }
        }
        fileOrDirectory.delete();
    }
}
// AUTOGENERATED FILE - DO NOT MODIFY!
// This file generated by Djinni from mynteye.djinni

package com.slightech.mynteye;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/** Device class to communicate with MYNT® EYE device */
public interface Device {
    /** Get the model */
    @NonNull
    public com.slightech.mynteye.Model getModel();

    /** Supports the stream or not */
    public boolean supportsStream(@NonNull com.slightech.mynteye.Stream stream);

    /** Supports the capability or not */
    public boolean supportsCapability(@NonNull com.slightech.mynteye.Capability capabilities);

    /** Supports the option or not */
    public boolean supportsOption(@NonNull com.slightech.mynteye.Option option);

    /** Supports the addon or not */
    public boolean supportsAddon(@NonNull com.slightech.mynteye.Addon addon);

    /** Get all stream requests */
    @NonNull
    public ArrayList<com.slightech.mynteye.StreamRequest> getStreamRequests();

    /** Config the stream request */
    public void configStreamRequest(@NonNull com.slightech.mynteye.StreamRequest request);

    /** Get the device info */
    @NonNull
    public String getInfo(@NonNull com.slightech.mynteye.Info info);

    /** Get the intrinsics of stream */
    @NonNull
    public com.slightech.mynteye.Intrinsics getIntrinsics(@NonNull com.slightech.mynteye.Stream stream);

    /** Get the extrinsics of stream */
    @NonNull
    public com.slightech.mynteye.Extrinsics getExtrinsics(@NonNull com.slightech.mynteye.Stream from, @NonNull com.slightech.mynteye.Stream to);

    /** Get the intrinsics of motion */
    @NonNull
    public com.slightech.mynteye.MotionIntrinsics getMotionIntrinsics();

    /** Get the extrinsics from one stream to motion */
    @NonNull
    public com.slightech.mynteye.Extrinsics getMotionExtrinsics(@NonNull com.slightech.mynteye.Stream from);

    /** Get the option info */
    @NonNull
    public com.slightech.mynteye.OptionInfo getOptionInfo(@NonNull com.slightech.mynteye.Option option);

    /** Get the option value */
    public int getOptionValue(@NonNull com.slightech.mynteye.Option option);

    /** Set the option value */
    public void setOptionValue(@NonNull com.slightech.mynteye.Option option, int value);

    /** Run the option value */
    public boolean runOptionAction(@NonNull com.slightech.mynteye.Option option);

    /** Start capturing the source */
    public void start(@NonNull com.slightech.mynteye.Source source);

    /** Stop capturing the source */
    public void stop(@NonNull com.slightech.mynteye.Source source);

    /** Wait the streams are ready */
    public void waitForStreams();

    /** Get the latest data of stream */
    @Nullable
    public com.slightech.mynteye.StreamData getStreamData(@NonNull com.slightech.mynteye.Stream stream);

    /** Get the datas of stream */
    @NonNull
    public ArrayList<com.slightech.mynteye.StreamData> getStreamDatas(@NonNull com.slightech.mynteye.Stream stream);

    /** Enable cache motion datas until get them, otherwise using callback instead */
    public void enableMotionDatas(int maxSize);

    /** Get the motion datas */
    @NonNull
    public ArrayList<com.slightech.mynteye.MotionData> getMotionDatas();

    /** Create the device instance */
    @Nullable
    public static Device create(@NonNull com.slightech.mynteye.DeviceUsbInfo info)
    {
        return CppProxy.create(info);
    }

    static final class CppProxy implements Device
    {
        private final long nativeRef;
        private final AtomicBoolean destroyed = new AtomicBoolean(false);

        private CppProxy(long nativeRef)
        {
            if (nativeRef == 0) throw new RuntimeException("nativeRef is zero");
            this.nativeRef = nativeRef;
        }

        private native void nativeDestroy(long nativeRef);
        public void _djinni_private_destroy()
        {
            boolean destroyed = this.destroyed.getAndSet(true);
            if (!destroyed) nativeDestroy(this.nativeRef);
        }
        protected void finalize() throws java.lang.Throwable
        {
            _djinni_private_destroy();
            super.finalize();
        }

        @Override
        public com.slightech.mynteye.Model getModel()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getModel(this.nativeRef);
        }
        private native com.slightech.mynteye.Model native_getModel(long _nativeRef);

        @Override
        public boolean supportsStream(com.slightech.mynteye.Stream stream)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_supportsStream(this.nativeRef, stream);
        }
        private native boolean native_supportsStream(long _nativeRef, com.slightech.mynteye.Stream stream);

        @Override
        public boolean supportsCapability(com.slightech.mynteye.Capability capabilities)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_supportsCapability(this.nativeRef, capabilities);
        }
        private native boolean native_supportsCapability(long _nativeRef, com.slightech.mynteye.Capability capabilities);

        @Override
        public boolean supportsOption(com.slightech.mynteye.Option option)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_supportsOption(this.nativeRef, option);
        }
        private native boolean native_supportsOption(long _nativeRef, com.slightech.mynteye.Option option);

        @Override
        public boolean supportsAddon(com.slightech.mynteye.Addon addon)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_supportsAddon(this.nativeRef, addon);
        }
        private native boolean native_supportsAddon(long _nativeRef, com.slightech.mynteye.Addon addon);

        @Override
        public ArrayList<com.slightech.mynteye.StreamRequest> getStreamRequests()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getStreamRequests(this.nativeRef);
        }
        private native ArrayList<com.slightech.mynteye.StreamRequest> native_getStreamRequests(long _nativeRef);

        @Override
        public void configStreamRequest(com.slightech.mynteye.StreamRequest request)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_configStreamRequest(this.nativeRef, request);
        }
        private native void native_configStreamRequest(long _nativeRef, com.slightech.mynteye.StreamRequest request);

        @Override
        public String getInfo(com.slightech.mynteye.Info info)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getInfo(this.nativeRef, info);
        }
        private native String native_getInfo(long _nativeRef, com.slightech.mynteye.Info info);

        @Override
        public com.slightech.mynteye.Intrinsics getIntrinsics(com.slightech.mynteye.Stream stream)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getIntrinsics(this.nativeRef, stream);
        }
        private native com.slightech.mynteye.Intrinsics native_getIntrinsics(long _nativeRef, com.slightech.mynteye.Stream stream);

        @Override
        public com.slightech.mynteye.Extrinsics getExtrinsics(com.slightech.mynteye.Stream from, com.slightech.mynteye.Stream to)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getExtrinsics(this.nativeRef, from, to);
        }
        private native com.slightech.mynteye.Extrinsics native_getExtrinsics(long _nativeRef, com.slightech.mynteye.Stream from, com.slightech.mynteye.Stream to);

        @Override
        public com.slightech.mynteye.MotionIntrinsics getMotionIntrinsics()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getMotionIntrinsics(this.nativeRef);
        }
        private native com.slightech.mynteye.MotionIntrinsics native_getMotionIntrinsics(long _nativeRef);

        @Override
        public com.slightech.mynteye.Extrinsics getMotionExtrinsics(com.slightech.mynteye.Stream from)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getMotionExtrinsics(this.nativeRef, from);
        }
        private native com.slightech.mynteye.Extrinsics native_getMotionExtrinsics(long _nativeRef, com.slightech.mynteye.Stream from);

        @Override
        public com.slightech.mynteye.OptionInfo getOptionInfo(com.slightech.mynteye.Option option)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getOptionInfo(this.nativeRef, option);
        }
        private native com.slightech.mynteye.OptionInfo native_getOptionInfo(long _nativeRef, com.slightech.mynteye.Option option);

        @Override
        public int getOptionValue(com.slightech.mynteye.Option option)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getOptionValue(this.nativeRef, option);
        }
        private native int native_getOptionValue(long _nativeRef, com.slightech.mynteye.Option option);

        @Override
        public void setOptionValue(com.slightech.mynteye.Option option, int value)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_setOptionValue(this.nativeRef, option, value);
        }
        private native void native_setOptionValue(long _nativeRef, com.slightech.mynteye.Option option, int value);

        @Override
        public boolean runOptionAction(com.slightech.mynteye.Option option)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_runOptionAction(this.nativeRef, option);
        }
        private native boolean native_runOptionAction(long _nativeRef, com.slightech.mynteye.Option option);

        @Override
        public void start(com.slightech.mynteye.Source source)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_start(this.nativeRef, source);
        }
        private native void native_start(long _nativeRef, com.slightech.mynteye.Source source);

        @Override
        public void stop(com.slightech.mynteye.Source source)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_stop(this.nativeRef, source);
        }
        private native void native_stop(long _nativeRef, com.slightech.mynteye.Source source);

        @Override
        public void waitForStreams()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_waitForStreams(this.nativeRef);
        }
        private native void native_waitForStreams(long _nativeRef);

        @Override
        public com.slightech.mynteye.StreamData getStreamData(com.slightech.mynteye.Stream stream)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getStreamData(this.nativeRef, stream);
        }
        private native com.slightech.mynteye.StreamData native_getStreamData(long _nativeRef, com.slightech.mynteye.Stream stream);

        @Override
        public ArrayList<com.slightech.mynteye.StreamData> getStreamDatas(com.slightech.mynteye.Stream stream)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getStreamDatas(this.nativeRef, stream);
        }
        private native ArrayList<com.slightech.mynteye.StreamData> native_getStreamDatas(long _nativeRef, com.slightech.mynteye.Stream stream);

        @Override
        public void enableMotionDatas(int maxSize)
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            native_enableMotionDatas(this.nativeRef, maxSize);
        }
        private native void native_enableMotionDatas(long _nativeRef, int maxSize);

        @Override
        public ArrayList<com.slightech.mynteye.MotionData> getMotionDatas()
        {
            assert !this.destroyed.get() : "trying to use a destroyed object";
            return native_getMotionDatas(this.nativeRef);
        }
        private native ArrayList<com.slightech.mynteye.MotionData> native_getMotionDatas(long _nativeRef);

        @Nullable
        public static native Device create(@NonNull com.slightech.mynteye.DeviceUsbInfo info);
    }
}
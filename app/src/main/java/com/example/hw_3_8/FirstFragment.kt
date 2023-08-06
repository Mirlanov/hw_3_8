package com.example.hw_3_8

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.hw_3_8.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: CharactersAdapter
    private var charactersList = arrayListOf<Characters>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = CharactersAdapter(charactersList, this::onClick)

        charactersList.add(Characters("Harry Potter", "alive", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/7QEkUGhvdG9zaG9wIDMuMAA4QklNBAQHQ2FwdGlvbgAAAOYcAgAAAgACHAJ4AFFIQVJSWSBQT1RURVIgQU5EIFRIRSBHT0JMRVQgT0YgRklSRSwgRGFuaWVsIFJhZGNsaWZmZSwgMjAwNSwgKGMpIFdhcm5lciBCcm90aGVycy8cAgUADU1DREhBUE8gRUMxMjQcAhkADDIwMDBzIG1vdmllcxwCGQAMIDIwMDUgbW92aWVzHAIZAA0gSGFycnkgcG90dGVyHAIZAAkgTS0yZmViMDUcAhkAByBNb3ZpZXMcAhkACSBQb3J0cmFpdBwCGQAKIFJhZGNsaWZmZRwCGQAHIGRhbmllbDhCSU0ECg5Db3B5cmlnaHQgRmxhZwAAAAABAQD/4RO+aHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/Pjx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iPjxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+PHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9InV1aWQ6YWI3YTcyOTktMTJhMC00ZmE2LTg5YTctZTM3YzAwNTc1NzcyIiB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iIHhtbG5zOnhhcFJpZ2h0cz0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL3JpZ2h0cy8iIHhhcFJpZ2h0czpNYXJrZWQ9IlRydWUiPjxkYzpkZXNjcmlwdGlvbj48cmRmOkFsdD48cmRmOmxpIHhtbDpsYW5nPSJ4LWRlZmF1bHQiPkhBUlJZIFBPVFRFUiBBTkQgVEhFIEdPQkxFVCBPRiBGSVJFLCBEYW5pZWwgUmFkY2xpZmZlLCAyMDA1LCAoYykgV2FybmVyIEJyb3RoZXJzLzwvcmRmOmxpPjwvcmRmOkFsdD48L2RjOmRlc2NyaXB0aW9uPjxkYzpzdWJqZWN0PjxyZGY6QmFnPjxyZGY6bGk+MjAwMHMgbW92aWVzPC9yZGY6bGk+PHJkZjpsaT4gMjAwNSBtb3ZpZXM8L3JkZjpsaT48cmRmOmxpPiBIYXJyeSBwb3R0ZXI8L3JkZjpsaT48cmRmOmxpPiBNLTJmZWIwNTwvcmRmOmxpPjxyZGY6bGk+IE1vdmllczwvcmRmOmxpPjxyZGY6bGk+IFBvcnRyYWl0PC9yZGY6bGk+PHJkZjpsaT4gUmFkY2xpZmZlPC9yZGY6bGk+PHJkZjpsaT4gZGFuaWVsPC9yZGY6bGk+PC9yZGY6QmFnPjwvZGM6c3ViamVjdD48ZGM6dGl0bGU+PHJkZjpBbHQ+PHJkZjpsaSB4bWw6bGFuZz0ieC1kZWZhdWx0Ij5NQ0RIQVBPIEVDMTI0PC9yZGY6bGk+PC9yZGY6QWx0PjwvZGM6dGl0bGU+PC9yZGY6RGVzY3JpcHRpb24+PC9yZGY6UkRGPjwveDp4bXBtZXRhPiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAo8P3hwYWNrZXQgZW5kPSJ3Ij8+/9sAhAAJBgcIBwYJCAcICgoJCw0WDw0MDA0bFBUQFiAdIiIgHR8fJCg0LCQmMScfHy09LTE1Nzo6OiMrP0Q/OEM0OTo3AQoKCg0MDRoPDxo3JR8lNzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzf/wAARCAAzADMDASIAAhEBAxEB/8QAGwAAAgIDAQAAAAAAAAAAAAAAAAUGBwECBAP/xAA0EAACAQMDAQYDBQkAAAAAAAABAgMABBEFIUESBhMiMVFhFDJxBxWhsdEjJDNCU4GRstL/xAAZAQADAQEBAAAAAAAAAAAAAAABAgMABQT/xAAdEQACAgMAAwAAAAAAAAAAAAAAAQIREiExA0FR/9oADAMBAAIRAxEAPwCBAAKpDZocEnYYrLqrDJArZYGK9SkgVzKPQeYTDDO1e8sRjgWVd+t+iMcsecDnG3+RWuH2yysedqbW9vJNrdra2wjb4azSTxFcF3JY+XG/PpTwjbN0jJkvvi3SVJIl/l8Oce5qX9idZSa8kspe4WaPdCfJx+vtUi1HTwbWFbjR4nLQkSSq7LgZOGUZ2H19ary2ifRO21tAbgMsU8XU7DpwjEZzn2JFXrXAyjjsuAIhAJU59sAVimVoIrq3Sa2hMsTDwuqgg0UtMGimLmOJYYUS0mgk3YySMf2qn5SBjbnfmsrE4QYORitjNcTlTeTtIUUIhkbPSo8lHoPauggADBFK1bsCOMxEblad9nJYbe9guBIkczFoSx4XAK59sk14x2HeQvJNdW1uqKXPesfLGeAcbDO+PyqRfC6fZaXp9lqOnXduZ42nSXoDvcvkZUqmWDAEALv5+ec5aMK2GL2PZJ0srNYzLA7Nju+hixH0yT+FVRA0WtdpJrueIrb99w2WlwekYPGdvLyq6+zOjaI9rLJb28kTx/xVuoWidVIyCQ+D0nf0Gx9DVK3E0DaxePpMNjPpcd11QPMSrRp1eE4z5eh525yKrGF9G8vkvhKdd7Ayanq1xexastskpBEPSfBsBwaKfd7cSAP8YB1DOAi/rRS2TxQu0jQX7VXcupXtpZxxwx5az04BHPnhujOBnB89zSLtJoF9oMcd/wByv3fLlu6L9UsB2wkox4SSQNs/llp2E1W5stVGkabcR2Fzfzq91P3AmJ6VwFUeW+c543pL9sM2raddxafqd2txcSfvLTKWBePdEyp2X5TsOQKrSaojtMU6u7js/bxs5Mt2TLI3JyM/809uPtGupdaXVIbOLvobXuLZJhlYXKr1P7+LqAG2Qd/Sox2hmYXkNv8A0oEGPQ80uLYA96WKtDOTT0NRruqpJqc/3hO82pwGG7dmyZVJB/tsCo9AxAxSLvjFIHTGRwRkY5BHIPpWzzEZKkH1FcTSdTMeM1ShCZ2n2l3NvbRwy6ZBI6DpLLIVBx7YP50VAG+Y0UMI/B8mXTpGpXWi9lWk0p0tZHU9UkcSB2+rYz+NVjd6jearqlpLqVzJcyNKMtKcn56zRRekIunZrZLa3d5Od1/1FcLk4O/FZopY8RpdYvufDKcbZrVaKKp6Mc7/ADt9aKKKAT//2Q=="))
        charactersList.add(Characters("Hermione Granger", "alive", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/7QFuUGhvdG9zaG9wIDMuMAA4QklNBAQHQ2FwdGlvbgAAAS8cAgAAAgACHAJ4AGJIQVJSWSBQT1RURVIgQU5EIFRIRSBTT1JDRVJFUidTIFNUT05FLCBFbW1hIFdhdHNvbiBhcyBIZXJtaW9uZSBHcmFuZ2VyLCBpbiBjbGFzcyBhdCBIb2d3YXJ0cywgMjAwMRwCBQANTVNESEFQTyBFQzAzMBwCGQAMMjAwMHMgbW92aWVzHAIZAAwgMjAwMSBtb3ZpZXMcAhkACiBDbGFzc3Jvb20cAhkABSBHaXJsHAIZAAcgTW92aWVzHAIZAAsgUmFpc2VkIGFybRwCGQAMIFJhaXNlZCBoYW5kHAIZAA0gUmFpc2luZyBoYW5kHAIZAA8gU2Nob29sIHVuaWZvcm0cAhkABiBTbWFydBwCGQAHIFdhdHNvbhwCGQAFIGVtbWEAOEJJTQQKDkNvcHlyaWdodCBGbGFnAAAAAAEBAP/hFDxodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+PHg6eG1wbWV0YSB4bWxuczp4PSJhZG9iZTpuczptZXRhLyI+PHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj48cmRmOkRlc2NyaXB0aW9uIHJkZjphYm91dD0idXVpZDozNjdmOTAyZS0zZDNlLTQxOTgtOTIxZS03MmJmNTVlOGIyYzQiIHhtbG5zOmRjPSJodHRwOi8vcHVybC5vcmcvZGMvZWxlbWVudHMvMS4xLyIgeG1sbnM6eGFwUmlnaHRzPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvcmlnaHRzLyIgeGFwUmlnaHRzOk1hcmtlZD0iVHJ1ZSI+PGRjOmRlc2NyaXB0aW9uPjxyZGY6QWx0PjxyZGY6bGkgeG1sOmxhbmc9IngtZGVmYXVsdCI+SEFSUlkgUE9UVEVSIEFORCBUSEUgU09SQ0VSRVImYXBvcztTIFNUT05FLCBFbW1hIFdhdHNvbiBhcyBIZXJtaW9uZSBHcmFuZ2VyLCBpbiBjbGFzcyBhdCBIb2d3YXJ0cywgMjAwMTwvcmRmOmxpPjwvcmRmOkFsdD48L2RjOmRlc2NyaXB0aW9uPjxkYzpzdWJqZWN0PjxyZGY6QmFnPjxyZGY6bGk+MjAwMHMgbW92aWVzPC9yZGY6bGk+PHJkZjpsaT4gMjAwMSBtb3ZpZXM8L3JkZjpsaT48cmRmOmxpPiBDbGFzc3Jvb208L3JkZjpsaT48cmRmOmxpPiBHaXJsPC9yZGY6bGk+PHJkZjpsaT4gTW92aWVzPC9yZGY6bGk+PHJkZjpsaT4gUmFpc2VkIGFybTwvcmRmOmxpPjxyZGY6bGk+IFJhaXNlZCBoYW5kPC9yZGY6bGk+PHJkZjpsaT4gUmFpc2luZyBoYW5kPC9yZGY6bGk+PHJkZjpsaT4gU2Nob29sIHVuaWZvcm08L3JkZjpsaT48cmRmOmxpPiBTbWFydDwvcmRmOmxpPjxyZGY6bGk+IFdhdHNvbjwvcmRmOmxpPjxyZGY6bGk+IGVtbWE8L3JkZjpsaT48L3JkZjpCYWc+PC9kYzpzdWJqZWN0PjxkYzp0aXRsZT48cmRmOkFsdD48cmRmOmxpIHhtbDpsYW5nPSJ4LWRlZmF1bHQiPk1TREhBUE8gRUMwMzA8L3JkZjpsaT48L3JkZjpBbHQ+PC9kYzp0aXRsZT48L3JkZjpEZXNjcmlwdGlvbj48L3JkZjpSREY+PC94OnhtcG1ldGE+ICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgIAogICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAKICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCiAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgICAgCjw/eHBhY2tldCBlbmQ9InciPz7/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADMAMwMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAABgUHAQMEAv/EADUQAAIBAwIDBQQJBQAAAAAAAAECAwAEEQUhBhIxEyJBUbEUYXHBByMyQlJigZGzFZKho9H/xAAZAQACAwEAAAAAAAAAAAAAAAACAwEEBQD/xAAoEQACAQMBBQkAAAAAAAAAAAABAgADESExBBITMkEiI0JDUXGBkfD/2gAMAwEAAhEDEQA/AF7haLlvhnJ7hO/wps1DtfYpFRCcsFUedLvCyiTUyijpGflTdqpij0q7lYkLChdiR0A3PpWTXzUmgmBOOws5orCKSYrugJC7DH6+db79S7rkd0qh3+B/7URZcVw6xNFaW9vLCEiyS5U8+MdAOh61L3W7xZwcKoJHXy3pZVlPaGYTsrEldJCzAG4k2+8fWvBAAJrolUdvN7mPrWvsy7YxkD30wQYRLF2a5tuY+fN1op90bg60vtKtbr2g/WxhiOXofEUUXBqHNpPGQYvKz4Ofl1SRlXOIz++RUvr+oTppd+GPdeKQKSPdj51D/R8S17cM7K55GG3huK3fSFcpFw9dRjKs7Rou/wCbJ/wDRst6wHtFb1kvF3hWYx67b4Och1P9hp/vZmD8oUcqhQARjpVO8PXfses20xDMiMeZV8Rgj50y3vEeo6nestsEtELYVI/Dy3NO2iiWe49IFJ+zG1Tzsz/iYmtkZCSc1LCXGq6PepBqc0U8EpKq6jcMDj1qft5GOeZWDA4IYVWKWz0j83sZaXA11jhe0DdQ0o/2NRUbwdMq8PWwP45f5GoqyKlhaVWXJlP8ATdn2p8WbG5x5Vj6SDL7Haq6gB7jII3GykfOuLhZiLSQr4HNcGvXMt3fRW0vMIovrHTOO8fd8PWi3e+vJ8u0j7KADJ5dvshsbsT1x8PnThwdoNpqcdzLc3BSQNyqOUEcuPf459KXYJUnlJjB7ikCpDS7i8tLtJLLlmDjD27Zw4Clm3/Q/uK6vvspCmxj9n3FYFhcSV43sIhpseoWjuiQMsQicYJbu7rj9c/LFZ0fV5Zbw2k6HnwX5yemd6Xr3V/6xctElsLOCI8wiR8ln6ZLHes+1yrGbyLvTiMo3gR76FaTCmEbWdVdWcumkuXha5K6JAPzy/yNRVU2PHmrWVqkEK2nIpJHNGc7kk/e8zWKg7O8VxUkPp00sOlOYpGQltypx4muWVm7QyFiXx9onJooq0OYwPAJr0Vj2rb+XrimHgB2PEbZY4h55IxnYMQRnHwNFFDW5Wk0unzFmzkdoZyxySQT8SDmu6Fivs5Unv8ANze/YVmijaAn77kfckrcSBTgA9KKKKYNIltZ/9k="))
        charactersList.add(Characters("Ron Weasley", "alive", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADMAMwMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAABgQFAQMHAv/EADcQAAIBAwMBBgALCQAAAAAAAAECAwAEEQUSITEGE0FRYXEHFBUiMkJigZGx8CMkM0OCocHR8f/EABgBAAMBAQAAAAAAAAAAAAAAAAIDBAEA/8QAHBEAAwEAAwEBAAAAAAAAAAAAAAECEQMhMTJR/9oADAMBAAIRAxEAPwDmKrxWCtbAPSjFI0eP3Yi1t9O023vWAF3cpJKZGX+FEG2Lz0GSCfPmrBdVjtLyW6V2eAYyDjOOgz5+dLWmXEs9laWkMO9GgKyqvUlXbH/PU1JfSNQu7KZTHMohAKg4y3OMflU9y6odLxHjtvZWV5Y2+v6WgRJZO5nUDqcEhj65BU+6+fKaVpo1y2udN0qG3uQn7dQBhsNgNnJX+kDPqaXNvFOXSwVXpp21mtoXjpRW6YbNgo7vLAAEknAA5JraVqKZpXTfCwRDnafrH19K2ZdHU0hw7JwWsLTw3E6/KB2m0jBIG7ncpbpuxjA8/wAKZRqdxLInxVJBwEnTC4PPqpIP661yMXk0ORMd6jqehWnqz1qXU7O27i7jg1VQdsjxhkvGH0VbPRseP1sH1FE4Nnk/Cq7ZTzXPaG5FxE0JhxEqN1AHj95JPsRVKBU7UtTuNY19vlPYk0qKN4QL4DbnAHOMAn7I8qi4KEgjBHBFDU4Ynp520V7ooQglYpG7nwBNVRum4AgcRqMKR/qra8AaMRgZdzgKTgH3Pl0rXHYR7kX4yVZj9IAY6eX48U7iXWibfeFdcyq7I6dGUg+R/X+KxHObaL4u2XtpVyykcxtnIK/248ea6X8H3ZbRLu2udWvoY5ZDIyWMN6P3d3UAMzADHJ4wc4wTg8Uldr9Pe1vVuhaC1gu5Ju7iVgVTZIVKqB0UDYB59fHALVuGY0tKi5Z2BkLkyBt24nJz71boe+HeHqxyfeqZuYceQqy059ysvlgj8KHkXQXG+yTtFFbNooqfR2EHUSRKvPU7fu2k/nUO4dhdIAxx878jRRVM/JNXp0zsPNKOzBjEjd33j/MJyvLnwpc+EeWTvNMh3t3XdvJszxuLYzj2ArFFcvobXwhT/ln2qXpZPfMPs0UV1+MXHpaUUUVKUn//2Q=="))
        charactersList.add(Characters("Albus Dumbledore", "death", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wCEAAkGBwgHBgkIBwgKCgkLDRYPDQwMDRsUFRAWIB0iIiAdHx8kKDQsJCYxJx8fLT0tMTU3Ojo6Iys/RD84QzQ5OjcBCgoKDQwNGg8PGjclHyU3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3N//AABEIADMAMwMBIgACEQEDEQH/xAAbAAACAgMBAAAAAAAAAAAAAAAABgQFAQMHAv/EADMQAAEDAwICCAQGAwAAAAAAAAECAxEABCEFEjFBBhMUIlFhobGBkcHwBxUjMnLRM1Jx/8QAGAEBAQEBAQAAAAAAAAAAAAAAAgMEAQD/xAAcEQEBAAMBAAMAAAAAAAAAAAAAAQIRMSEDEjL/2gAMAwEAAhEDEQA/AOSl9P7ClcnkDxrDzygmVlcHJyPvmfnURY6tRhW7lJqXott+Y6zaWistuOjf/EZPpR1D26z0C0jRbbo81cajprFxfLUFK69PWEYlJKT3RCVRw4zVhr2laNrY7P8Al7du4UfpvspSlSTy4Dh5cKg6DfLdtFqbDQILkynOCYPtUm6dW2jtRWJTtUIXO7gTy4VG5Vpnxz6uRXLbmm6k7bKgPW6lJOCJPCZGYI96gvfvk8xOTNNv4maf2XpUHhhNy0VY5kAj220p3Sdj5T4Ae1WxZsmqiiimD0pJPAFSlGNozJ5RTf0Z6PXumuDUr1rqSAUpQpQnw5VRdHbRL9+p50Sy0RhWQVH+s+lP7jpdDjBXOxUkRMiJHpQy4c606aXEssONhBK5UrcJHGKsru6W5Z7RxzIH0qn0e4hnqVYUyox/En+5qYp0DcoqwMk+HnWa9aJl5pnpxYua1pdnd27ZcebztSJJEEED0rmN8kpu1pUCFAJkERGBXX9Lf32RaUILZkR4Z+kUnfiBbtuMMXjbaQ4lwpcWBBKSBE/H3q/x1DMlUUVmqpnvRNN7HpSAR+oBudATMzxn/nD4Vhm76jUnUtqO0MCJ+QpnutIvmbcu2ZXctie82UpSD4HaT98YpAvU31tq7jlzavoCkhJUptW2c8yKF9hy6WVvcdU8lwEmAdw5lOJq/fXbmx6zenY5ABnjNKDTsPtTkOBSd3ieX350x2JbcZ2KAgpHzqWU4pL15tNQU1dKRBCE8B5Rj61o19PbdLuAwNwU2VwTwIzUe9LltfJa3SP8iTHhW7Rz2rrV7FFpIjOAeRE0pPRvCDPnRUjUbNyzvXmOrUAlXdA73dORkeRFFVSde6S6heI1tdi3cuItkuIQEIMY2pMSM8zURlSnnkNuKJQTBSDAOeYrNFBWFHpKy3bNhTCQg91eP9txE+gqy0sncBJjeRFFFHLjk/TbrYBbYJGe9n4GrS1ZbZtkNtJCUBrgKKKU47eq29sLRd0tS7dtRxkjyooorm3n/9k="))
        charactersList.add(Characters("Lord Voldemort", "death", "data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/4QCbRXhpZgAASUkqAAgAAAABAA4BAgB5AAAAGgAAAAAAAABMb3JkIFZvbGRlbW9ydCAtIENvdXJ0ZXN5IG9mIFdhcm5lciBCcm9zLiBFbnRlcnRhaW5tZW50IEluYy4gIChQaG90byBieSBFcmljIENoYXJib25uZWF1L1dpcmVJbWFnZSkgKioqIExvY2FsIENhcHRpb24gKioq/+0AvFBob3Rvc2hvcCAzLjAAOEJJTQQEAAAAAACfHAJQAA5FLiBDaGFyYm9ubmVhdRwCeAB5TG9yZCBWb2xkZW1vcnQgLSBDb3VydGVzeSBvZiBXYXJuZXIgQnJvcy4gRW50ZXJ0YWlubWVudCBJbmMuICAoUGhvdG8gYnkgRXJpYyBDaGFyYm9ubmVhdS9XaXJlSW1hZ2UpICoqKiBMb2NhbCBDYXB0aW9uICoqKhwCbgAJV2lyZUltYWdlAP/hA09odHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvAAk8cmRmOlJERiB4bWxuczpyZGY9Imh0dHA6Ly93d3cudzMub3JnLzE5OTkvMDIvMjItcmRmLXN5bnRheC1ucyMiPgoJCTxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnBob3Rvc2hvcD0iaHR0cDovL25zLmFkb2JlLmNvbS9waG90b3Nob3AvMS4wLyIgeG1sbnM6SXB0YzR4bXBDb3JlPSJodHRwOi8vaXB0Yy5vcmcvc3RkL0lwdGM0eG1wQ29yZS8xLjAveG1sbnMvIiB4bWxuczpHZXR0eUltYWdlc0dJRlQ9Imh0dHA6Ly94bXAuZ2V0dHlpbWFnZXMuY29tL2dpZnQvMS4wLyIgeG1sbnM6ZGM9Imh0dHA6Ly9wdXJsLm9yZy9kYy9lbGVtZW50cy8xLjEvIiB4bWxuczpwbHVzPSJodHRwOi8vbnMudXNlcGx1cy5vcmcvbGRmL3htcC8xLjAvIiB4bWxuczppcHRjRXh0PSJodHRwOi8vaXB0Yy5vcmcvc3RkL0lwdGM0eG1wRXh0LzIwMDgtMDItMjkvIiBwaG90b3Nob3A6Q3JlZGl0PSJXaXJlSW1hZ2UiIEdldHR5SW1hZ2VzR0lGVDpBc3NldElEPSI3NzIwMjQ1OCIgPgo8ZGM6Y3JlYXRvcj48cmRmOlNlcT48cmRmOmxpPkUuIENoYXJib25uZWF1PC9yZGY6bGk+PC9yZGY6U2VxPjwvZGM6Y3JlYXRvcj48ZGM6ZGVzY3JpcHRpb24+PHJkZjpBbHQ+PHJkZjpsaSB4bWw6bGFuZz0ieC1kZWZhdWx0Ij5Mb3JkIFZvbGRlbW9ydCAtIENvdXJ0ZXN5IG9mIFdhcm5lciBCcm9zLiBFbnRlcnRhaW5tZW50IEluYy4gIChQaG90byBieSBFcmljIENoYXJib25uZWF1L1dpcmVJbWFnZSkgKioqIExvY2FsIENhcHRpb24gKioqPC9yZGY6bGk+PC9yZGY6QWx0PjwvZGM6ZGVzY3JpcHRpb24+CgkJPC9yZGY6RGVzY3JpcHRpb24+Cgk8L3JkZjpSREY+Cv/bAIQACQYHCAcGCQgHCAoKCQsNFg8NDAwNGxQVEBYgHSIiIB0fHyQoNCwkJjEnHx8tPS0xNTc6OjojKz9EPzhDNDk6NwEKCgoNDA0aDw8aNyUfJTc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3Nzc3/8AAEQgAMwAzAwEiAAIRAQMRAf/EABsAAAICAwEAAAAAAAAAAAAAAAAGBQcBAwQC/8QALRAAAgEDAgQFBAIDAAAAAAAAAQIDAAQRBSESEzFBBlFhcYEikbHRQuEHIzL/xAAZAQEBAQEBAQAAAAAAAAAAAAADBAIBBQD/xAAhEQACAgEDBQEAAAAAAAAAAAAAAQIRAxIhMSIyQVFhBP/aAAwDAQACEQMRAD8Aq6BHkuI4lOC7hc+5q3NAlihgWOJcLGAAPSqosX4LuFsdGzTS2tX1lb8q1iDO7Y48ZqzIrPPpt7Fv6ddxumDt713LfRBGYuoA7k7VTejW3ie9u0lmu5YrbOXOQNvLanHxFoCazp1tGt3NalAMsrHhfHZqjljV8iJ1sTWtvZ6rplxbGWN1dCCFbPyPz8VS0waNij440Yq2PMHBp2s/A1/p9wstvdERDcjbDD4pV8TacdN1SZnljYXDGYBCcrk99sZznpVX52lsmFlj5IwvvRXOzZYkDaiqrB0nnRgs0/DJEzgLsytjhPY+vSn3Q7m2ECRTwxuemCM1X+h30Nleu05YRSRlG4c+hHT2pn0K7glxwPxZP/XTNTTVlEkPjXBndUjwkMeNgMAn9CpB5JpLPlnBfO/Dvtv/AFSrqd1d25tksAC85ChihYKcdSB7URRa7cIi3WqzxROMnlqIyOh8hjYnv2oGkfJjIJ54YnhWQug3UnqvpSH/AJDWSTT7C4wu0sise+/CR+DTH4f58BvobqVpQrERyM3EzL1BO3XtSF4uuHm1Z05rNGijhXOynvgUmKPUcmQ6PlQTWa05A70VVqRijg6daltBnkiErISQrKSB65/Var61bnEAddgOlSWjabLawyNKy5lwQqnOAM9fvRSGUlKNjdpd2NWsFhVwJozuCcH0NTdlpTuBz7ngA8sbfNVw8bxzcyJ2jYd1OK9z65qcMfLS6P1em5o2rMq1wPWp3drpETMkwknl+lUUbk1WVxI0k0ksjZd2yamdFglmuTdXcjPwb5bfeomexKXUkZuFkRXOHT+Y86SC9GX9NAx50V2C2twMFWJ96K3pYdoxqI/3CmTTVD6fbswyxTc0UVmZ3F2nDeKBnA71FhVaf6hnBwPtWKKNDkjqLtBpI5TFOIhTjyPUVD2xPnRRTRDlwbHY8R3ooorrMH//2Q=="))

        binding.rvCharacters.adapter = adapter
    }

    private fun onClick(characters: Characters) {
        findNavController().navigate(FirstFragmentDirections.actionMainFragmentToSecondFragment(characters))
    }
}
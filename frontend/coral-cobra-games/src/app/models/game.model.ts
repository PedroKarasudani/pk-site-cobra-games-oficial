import { Banner } from "./banner.model";

export interface Games {
  id: number;
  title: string;
  description: string;
  platform: string;
  linkDownload: string;
  releaseDate: string; // LocalDateTime -> string
  banner?: Banner;
}
